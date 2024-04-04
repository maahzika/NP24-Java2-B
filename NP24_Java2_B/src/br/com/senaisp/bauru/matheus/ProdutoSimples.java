package br.com.senaisp.bauru.matheus;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoSimples {
	private int id;
	private String descricao;
	private int saldo;
	private double custo;
	//Usando o conector para BD
	private Connection conn;
	//Constructor
	public ProdutoSimples() throws SQLException {
		id = 0;
		saldo = 0;
		custo = 0;
		//Instanciando o DriverManager
		conn = DriverManager.getConnection("jdbc:sqlite:c:\\Javalibs\\dados\\NP24_JAVA2_B.DB");
	}
	//Gettes e setters
	public int getId() {
		return id;
	}
	public void setId(int id) throws Exception {
		if(id<0) {
			throw new Exception("O id não pode ser negativo!");
		}
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	//
	public static ProdutoSimples create (String des, 
			int sal, double cus) throws SQLException {
		ProdutoSimples ret = new ProdutoSimples();
		//Setando os valore
		ret.setDescricao(des);
		ret.setCusto(cus);
		ret.setSaldo(sal);
		//Gravar no banco de dados
		//Preparando o comando para o banco de dados
		PreparedStatement stm = ret.conn.
				prepareStatement("insert into "
						+ "produto(descricao, saldo,custo)"
						+ "values(?,?,?)",Statement.RETURN_GENERATED_KEYS);
		//Os parametros começa com 1 e não zero
		stm.setString(1, des);
		stm.setInt(2, sal);
		stm.setDouble(3, cus);
		//Executando o comand  de inserção
		int linhas = stm.executeUpdate();
		System.out.println("Adicionei " + linhas + "no banco!");
		ResultSet rs = stm.getGeneratedKeys();
		rs.next();
		try {
			ret.setId(rs.getInt(1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
		
		//
		return ret;
	}

}

	