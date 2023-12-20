@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Desactivar la protección CSRF (puedes activarla si es necesario)
        http.csrf().disable();

        // Configurar la autorización
        http.authorizeRequests()
            .antMatchers("/api/public/**").permitAll() // Rutas públicas
            .anyRequest().authenticated();

        // Configurar el filtro de JWT
        http.apply(new JwtTokenFilterConfigurer(jwtTokenProvider));
    }
}
