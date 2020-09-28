package com.cybertek.tests.day10_file_upload;

import org.testng.annotations.Test;

public class FilePathExample {

    @Test
    public void test1(){

        //System.getProperty("user.dir");
        //It gives us the path below:
        //C:\Users\nb\IdeaProjects\EU3TestNGSelenium

        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/textfile.txt"; //right click to textfile
                                                             //copy+copy path+choose one

        String fullPath = projectPath+"/"+filePath;
        System.out.println(fullPath);

    }

}
