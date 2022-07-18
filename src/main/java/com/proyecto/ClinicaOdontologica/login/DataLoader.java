package com.proyecto.ClinicaOdontologica.login;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.boot.ApplicationArguments;
    import org.springframework.boot.ApplicationRunner;
    import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
    import org.springframework.stereotype.Component;


@Component
    public class DataLoader implements ApplicationRunner {
        private IUserRepository userRepository;

        @Autowired
        public DataLoader(IUserRepository userRepository){
            this.userRepository=userRepository;
        }

        @Override
        public void run(ApplicationArguments args) throws Exception {
            BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
            String password1=passwordEncoder.encode("password");
            String password2=passwordEncoder.encode("password1");
            userRepository.save(new AppUser("Andrea", "Andrea", "trebol2@gmail.com", password1, AppUsuarioRoles.ADMIN));
            userRepository.save(new AppUser("Mario", "Mario2", "hera@gmail.com", password2, AppUsuarioRoles.USER));
        }

    }
