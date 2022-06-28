package P3.Decorator;

public interface IPersonaje {

    void showInfo();
    void operation();

    int getNivel();
    int getPorcentajeArmadura();
    int getPuntosAtaque();
    int getPuntosDefensa();
    int getPuntosRegeneracion();
    String getArmas();
    PersonajeHumano getPersonaje();

    void setNivel(int nivel);
    void setPorcentajeArmadura(int porcentajeArmadura);
    void setPuntosAtaque(int puntosAtaque);
    void setPuntosDefensa(int puntosDefensa);
    void setPuntosRegeneracion(int puntosRegeneracion);
    void setArmas(String armas);



}
