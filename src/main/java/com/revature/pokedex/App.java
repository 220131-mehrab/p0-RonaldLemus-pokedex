package com.revature.pokedex;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args){
        String webAppName = "pokedex";
        DexRepository dexRepository;
        //Repository dexRepository = new CSVDexRepository("National_Pokedex.csv");
        dexRepository = new InMemoryDexRepository();
        DexService dexService = new DexService(dexRepository);
        SearchFormService sfService = new SearchFormService();

        Tomcat server = new Tomcat();
        server.setBaseDir(System.getProperty("java.io.tmpdir"));
        server.setPort(0);
        server.getConnector();
        server.addContext(webAppName, null);

        server.addServlet(webAppName, "defaultServlet", new DefaultServlet()).addMapping("/*");
        server.addServlet(webAppName, "dexServlet", dexService).addMapping("/pokemon");
        server.addServlet(webAppName, "searchFormServlet", sfService).addMapping("/search");
       // System.out.println("Server running on http://localhost:" + server.getHost
        try {
            server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}