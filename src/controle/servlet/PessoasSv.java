package controle.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.sql.Timestamp;


import model.Cliente;
import model.Dependentes;

/**
 * Servlet implementation class PessoasS
 */
@WebServlet("/pessoaSv")
public class PessoasSv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PessoasSv() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		
		//recebendo instania de escritor de reposta.
		PrintWriter out = response.getWriter();
		
	
		
		  List<Cliente> listaClientes = new ArrayList<Cliente>();
	        
	        Cliente c = new Cliente();
	        c.setCodigo(1);
	        c.setNome("Welton");
	        c.setEmail("welton@casaoi.com.br");
	        c.setNascimento(new Timestamp(System.currentTimeMillis()));
	        Dependentes d = new Dependentes();
	        d.setCodigo(1);
	        d.setNome("Jose Junior");
	        c.setDependentes(d);
	        listaClientes.add(c);
	        
	        Cliente c2 = new Cliente();
	        c2.setCodigo(1);
	        c2.setNome("Laryssa");
	        c2.setEmail("laryssa@casaoi.com.br");
	        c2.setNascimento(new Timestamp(System.currentTimeMillis()));
	        listaClientes.add(c2);
	        
	        Type type = new TypeToken<List<Cliente>>(){}.getType();
	        
	        Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy HH:mm").create();
	        
	        out.append(gson.toJson(listaClientes, type));
	        
	}
}
