package test;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRUtil {
    public static void main(String[] args) {
		try{
			String path="./WebContent/example.jpg"; 
			BufferedImage img = ImageIO.read(new File(path));
			BufferedImage image = new BufferedImage(1121, 1482, BufferedImage.TYPE_INT_RGB);
			Graphics2D g = image.createGraphics(); 
			g.drawImage(img,0,0,1121,1482,null);
			g.setColor(Color.GRAY);
			g.setFont(new Font("고딕체",Font.BOLD,30));
			g.drawString("test text", 50, 50);

			ImageIO.write(image,"jpg",new File("./WebContent/example2.jpg"));
			}catch(Exception e){
			System.out.println(e);
			}
		/*
        QRCodeWriter q = new QRCodeWriter();
        try {
            String text = "";
            text = new String(text.getBytes("UTF-8"), "ISO-8859-1");
            BitMatrix bitMatrix = q.encode(text, BarcodeFormat.QR_CODE, 500, 500);
            MatrixToImageWriter.writeToStream(bitMatrix, "png",
                    new FileOutputStream(new File("test.png")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    }
}