public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados (){
        Vertebrado[] miVertebrados = new Vertebrado[3];
        miVertebrados[0] = new Vertebrado("Camello", "Mamifero"); 
        miVertebrados[1] = new Vertebrado("Vaca", "Mamifero"); 
       // miVertebrados[2] = new Vertebrado("Paloma", "Ave"); 
        miVertebrados[2] = new Vertebrado("Tiburón", "Pez"); 
        
        return miVertebrados;
    }
}
