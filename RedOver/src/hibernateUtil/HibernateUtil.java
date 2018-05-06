package hibernateUtil;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import dao.Anime;
import dao.Episodio;
import dao.Role;
import dao.Tags;
import dao.Users;

public class HibernateUtil {
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();
				
				Map<String, Object> settings = new HashMap<>();
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/mysqlds");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "");
				settings.put(Environment.HBM2DDL_AUTO, "update");
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				
				// Enable second level cache (default value is true)
	            settings.put(Environment.USE_SECOND_LEVEL_CACHE, true);
	            
	            settings.put(Environment.USE_QUERY_CACHE, true);
	            
	            // settings.put(Environment.GENERATE_STATISTICS, true);
	            // Specify cache region factory class
	            settings.put(Environment.CACHE_REGION_FACTORY,
	                  "org.hibernate.cache.jcache.JCacheRegionFactory");
	            
	            // Specify cache provider
	            settings.put("hibernate.javax.cache.provider", 
	                  "org.ehcache.jsr107.EhcacheCachingProvider");
				
				// HikariCP settings
				settings.put("cachePrepStmts", "true");
				settings.put("prepStmtCacheSize", "250");
				settings.put("prepStmtCacheSqlLimit", "2048");
				settings.put("useServerPrepStmts", "true");
				settings.put("cacheServerConfiguration", "true");
				settings.put("cacheResultSetMetadata", "true");
				// Maximum waiting time for a connection from the pool
				settings.put("hibernate.hikari.connectionTimeout", "10000");
				// Minimum number of ideal connections in the pool
				settings.put("hibernate.hikari.minimumIdle", "2");
				// Maximum number of actual connection in the pool
				settings.put("hibernate.hikari.maximumPoolSize", "4");
				// Maximum time that a connection is allowed to sit ideal in the pool
				settings.put("hibernate.hikari.idleTimeout", "30000");

				registryBuilder.applySettings(settings);

				registry = registryBuilder.build();
				MetadataSources sources = new MetadataSources(registry)
						.addAnnotatedClass(Anime.class)
						.addAnnotatedClass(Episodio.class)
						.addAnnotatedClass(Role.class)
						.addAnnotatedClass(Users.class)
						.addAnnotatedClass(Tags.class);
				Metadata metadata = sources.getMetadataBuilder().build();
				sessionFactory = metadata.getSessionFactoryBuilder().build();
				
			}catch (Exception e) {
				if (registry != null) {
					StandardServiceRegistryBuilder.destroy(registry);
				}
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}

	public static void shutdown() {
		if (registry != null) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
}
