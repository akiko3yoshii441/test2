/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yoshiiakiko
 */
@WebServlet(urlPatterns = {"/hikisuumodorichi2"})
public class hikisuumodorichi2 extends HttpServlet {
    //課題「引数、戻り値1」の3人分のプロフィールのうち、1人だけ住所の値をnullで定義し、ループ処理で全員分のプロフィールをid以外表示する処理を作成してください。
    //この際、nullになっているデータはcontinueで飛ばしながら表示してください

    public static String[][] makeArray(int num) {

        String allData[][] = new String[3][4];

        allData[0][0] = "1";
        allData[0][1] = "aki";
        allData[0][2] = "19911202";
        allData[0][3] = "nippori";

        allData[1][0] = "2";
        allData[1][1] = "ifi";
        allData[1][2] = "19960224";
        allData[1][3] = "nippori";

        allData[2][0] = "3";
        allData[2][1] = "kana";
        allData[2][2] = "19960221";
        allData[2][3] = null;

        
        //    return allData;
        
          if( num == 1 ){
              return allData;
          } else{
              return allData;
          }
            
            
            

    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter pw = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String[][] array = makeArray(1);

            String name[] = {"明子", "イフィ", "佳奈絵"};

            for (int i = 0; i < 3; i++) {
                pw.println(name[i] + "のデータ" + "<br>");

                for (int j = 0; j < 4; j++) {
                    

                    if (j == 0) {
                        continue;
                    }
                    if (array[i][j] == null) {
                        continue;
                    }
                    
                    pw.println(array[i][j]+ "<br>");
                }
            }
        }
    }        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
