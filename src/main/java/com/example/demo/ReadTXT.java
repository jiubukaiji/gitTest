package com.example.demo;

import java.io.*;
import java.util.*;

public class ReadTXT {


    public static void main(String[] args) {
        File file = new File("test.txt");

        List<String> idList = new ArrayList<>();
        List<String> agentNumList = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        if(file.isFile() && file.exists()){
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                String text = null;
                while((text = bufferedReader.readLine()) != null){
                    // 读取每一行
                    System.out.println(text);
                    String[] twoWords = text.split("\t");
                    System.out.println(twoWords.length);
                    if(twoWords.length == 1){
                        continue;
                    }
                    map.put(twoWords[1],twoWords[0]);
                    idList.add(twoWords[0]);
                    agentNumList.add(twoWords[1]);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("****");
        System.out.println(idList);
        System.out.println("%%%%%%%");
        System.out.println(agentNumList);
        System.out.println("$$$$$$");
        System.out.println(map);

        Collection<String> values = map.values();

        System.out.println("需要保留的结果");
        System.out.println(values);

        System.out.println("");

    }

    /**传入txt路径读取txt文件
     * @param txtPath
     * @return 返回读取到的内容
     */
    public static String readTxt(String txtPath) {
        File file = new File(txtPath);
        if(file.isFile() && file.exists()){
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                StringBuffer sb = new StringBuffer();
                String text = null;
                while((text = bufferedReader.readLine()) != null){
                    sb.append(text);
                }
                return sb.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    /**使用FileOutputStream来写入txt文件
     * @param txtPath txt文件路径
     * @param content 需要写入的文本
     */
    public static void writeTxt(String txtPath,String content){
        FileOutputStream fileOutputStream = null;
        File file = new File(txtPath);
        try {
            if(file.exists()){
                //判断文件是否存在，如果不存在就新建一个txt
                file.createNewFile();
            }
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(content.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
