package com.example.gestionbilletsbus;

import static com.example.service.QrCodeGenerator.createQR;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Maintest {

  public static void main(String[] args) throws IOException, WriterException {

    // The data that the QR code will contain
    String data = "www.geeksforgeeks.org";

    // The path where the image will get saved
    String path = "C:\\ASI\\ASIGestionBilletsBus\\images\\test.png";

    // Encoding charset
    String charset = "UTF-8";

    Map<EncodeHintType, ErrorCorrectionLevel> hashMap
        = new HashMap<EncodeHintType,
        ErrorCorrectionLevel>();

    hashMap.put(EncodeHintType.ERROR_CORRECTION,
        ErrorCorrectionLevel.L);

    // Create the QR code and save
    // in the specified folder
    // as a jpg file
    createQR(data, path, charset, hashMap, 200, 200);
    System.out.println("QR Code Generated!!! ");
  }

}
