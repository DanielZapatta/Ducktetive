import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Conexao {
    private JdbcTemplate conexaoBanco;
    Log informacao = new Log();

    public Conexao(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/Ducktetive");
        dataSource.setUsername("teste");
        dataSource.setPassword("urubu100");
        informacao.gravar("Fazendo login no banco");

        conexaoBanco = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConexaoBanco(){
        return conexaoBanco;
    }
}
