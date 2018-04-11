package app.exemplo.organizze.com.br.organizze.config;

import com.google.firebase.auth.FirebaseAuth;

public class ConfigurarFirebase {

    private static FirebaseAuth autenticacao;

    //Retorna a instancia do FirebaseAuth
    public static FirebaseAuth getFirebaseAutenticacao() {
        if (autenticacao == null) {
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;
    }

}
