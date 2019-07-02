package com.EBusiness.services.Impl;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import sun.misc.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

//上传文件
public class UploadServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response,String i) throws ServletException,IOException
    {
//      1:创建DiskFileItemFactory
        DiskFileItemFactory factory = new DiskFileItemFactory();
//      2:创建ServletFileUpload类
        ServletFileUpload upload = new ServletFileUpload(factory);
        try {
//            底层通过request获取数据，进行解析，将解析获取到的数据封装到List<FileItem>中
            List<FileItem> itemList = upload.parseRequest(request);
            //遍历集合
            for (FileItem item:itemList){
//              如果是表单组件,则获取<input type="text" name="content"这样的组件
                if (item.isFormField()){
//                    获取组件名，即name=""
                    String fileName = item.getFieldName();
//                    获取上传文件名
                    String name = item.getName();
                }else{
                    String name = item.getName();
//                     避免文件名重复 且因为不同浏览器获取的文件名不一样（有的包含文件路径，有的不包含）
                    name = name.substring(name.lastIndexOf("\\")+1);

                    FileOutputStream outputStream = new FileOutputStream("E:/cyan/EBusiness/src/main/webapp/upload/"+i);
//                    将输入文件流复制到输出文件流中
                    org.apache.commons.io.IOUtils.copy(item.getInputStream(),outputStream);
                }
            }
        }catch (FileUploadException e){
            e.printStackTrace();
        }
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response,String i) throws ServletException,IOException{
        doGet(request,response,i);
    }
}
