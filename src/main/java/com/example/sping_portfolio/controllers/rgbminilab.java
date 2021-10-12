package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */


import java.io.ByteArrayOutputStream;
import  org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Base64;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class rgbminilab {
    public String[] images = new String[3];
    public String[] binarydisplay = new String[3];
    public String[] baseencrypt  = new String[3];
    public String[] decimal = new String[3];
    public String[] hex = new String[3];
    public String[] color = new String[3];

    @GetMapping("/rgb")
    public String Images(@RequestParam(name="name", required=false, defaultValue="dream.png") String name, Model model, HttpServletRequest request,
                         HttpServletResponse response) throws IOException{

        model.addAttribute("name", name);
        //makes each image into an array
        images[0] = "images/dream.png";
        images[1] = "images/flower.png";
        images[2] = "images/rock.png";

        //check for button press
        String start = request.getParameter("go");
        if(Objects.equals(start, "Convert!")){

            //output loop
            for (int i=0; i<images.length;i++) {

                output Output;

                //calls to calculate binary
                Output = new binary();
                binarydisplay[i] = Output.files(images[i]);

                //calls to calculate base64
                Output = new base64();
                baseencrypt[i] = Output.files(images[i]);

                //calls to calculate decimal
                Output = new decimal();
                decimal[i] = Output.files(images[i]);

                //calls to calculate hexadecimal
                Output = new hexadecimal();
                hex[i] = Output.files(images[i]);

                //calls to calculate rgb
                Output = new rgb();
                color[i] = Output.files(images[i]);
            }

            return "rgb";
        }

        //exception handler
        else if(start==null){
            return "rgb";
        }

        return "rgb";
    }

}

//polymorphism
//outputs, don't know if polymorphism is best to accomplish this
class output{
    public String files(String i) throws IOException{
        return "0";
    }
}

//img to base64
class base64 extends output{
    public String files(String i){
        //converts image to file var
        File file = new File(i);
        String encodedfile;

        //exception handler
        try (FileInputStream fileInputStreamReader = new FileInputStream(file)){

            byte[] imageData = new byte[(int) file.length()];
            fileInputStreamReader.read(imageData);
            encodedfile = Base64.getEncoder().encodeToString(imageData);

        }

        catch(Exception e) {
            return "Image to base64 conversion has encountered an error";
        }
        return encodedfile;
    }
}


//img to rgb
class rgb extends output {
    public String files(String i) throws IOException{
        try{

        }catch(Exception e){
            return "Image to rgb conversion has encountered an error ";
        }

        return "0";
    }
}

//img to hex
class hexadecimal extends output{
    public String files(String i){
        return "0";
    }
}

//img to binary
class binary extends output{
    public String files(String i){

        return "0";
    }
}

//img to decimal
class decimal extends output{
    public String files(String i){
        return "0";
    }
}