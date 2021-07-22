package wzy.servlet;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;


/**
 * @author 网中鱼
 * @date 2021/7/22-10:21
 */
@Controller
public class FileUpload {
    @RequestMapping("fileLoad")
    public ResponseEntity<byte[]> fileLoad(HttpServletRequest request) throws Exception {
        ServletContext context = request.getSession().getServletContext();
        String realPath = context.getRealPath("/photo/2233.png");
        File file = new File(realPath);
        FileInputStream is = new FileInputStream(file);
        byte[] bytes = new byte[is.available()];
        is.read(bytes);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Content-Disposition","attachment;filename="+file.getName());

        return new ResponseEntity<byte[]>(bytes,httpHeaders, HttpStatus.OK);

    }
}
