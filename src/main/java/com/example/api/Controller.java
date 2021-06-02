package com.example.api;

import com.example.service.QrCodeGenerator;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  public Controller() {

  }
  private static final String QR_CODE_IMAGE_PATH = "./src/main/resources/QRCode.png";


  @GetMapping(value = "/genrateAndDownloadQRCode/{codeText}/{width}/{height}")
  public void download(
      @PathVariable("codeText") String codeText,
      @PathVariable("width") Integer width,
      @PathVariable("height") Integer height)
      throws Exception {
    QrCodeGenerator.generateQRCodeImage(codeText, width, height, QR_CODE_IMAGE_PATH);
  }
  // en enlevant le produces ça retourne le bytearray qui peut potentiellement être reconstruit
  @GetMapping(value = "/genrateQRCode/{codeText}/{width}/{height}",produces = MediaType.IMAGE_PNG_VALUE)
  public ResponseEntity<byte[]> generateQRCode(
      @PathVariable("codeText") String codeText,
      @PathVariable("width") Integer width,
      @PathVariable("height") Integer height)
      throws Exception {
    return ResponseEntity.status(HttpStatus.OK).body(
        QrCodeGenerator.getQRCodeImage(codeText, width, height));
  }



}
