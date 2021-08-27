import model.Forno2;
import model.Tv;
public class App{
    public static void main(String[] args) {
        /*
        Implementar Forno
        Considere um Forno sofisticado de controle via app Android/iOS. É possível ligar, desligar, ajustar temperatura e outros detalhes. Os modelos variam segundo seu volume, tensão, potência e dimensões (na forma largura, altura e profundidade em cm). Então, implemente conforme especificação a seguir.
        
        Casos de Teste:
        */
        Forno2 f = new Forno2(45, 220, 1700, 66, 40, 54);
        System.out.println(f.volume == 45);
        System.out.println(f.tensao == 220);
        System.out.println(f.potencia == 1700);
        System.out.println(f.largura == 66);
        System.out.println(f.altura == 40);
        System.out.println(f.profundidade == 54);
        // todos esses atributos devem ser constantes, as atribuições a seguir não podem compilar,
        // verifique se estão protegidas e então comente estas linhas:
        /*
        f.volume = 450;
        f.tensao = 2200;
        f.potencia = 17000;
        f.altura = 400;
        f.largura = 660;
        f.profundidade = 540;
        */
        // Novo Forno
        Forno2 forno = new Forno2(84, 220, 1860, 61, 58, 58);
        System.out.println(forno.volume == 84);
        System.out.println(forno.tensao == 220);
        System.out.println(forno.potencia == 1860);
        System.out.println(forno.altura == 58);
        System.out.println(forno.largura == 61);
        System.out.println(forno.profundidade == 58);
        
        // métodos para consulta
        System.out.println(forno.temperatura()); // 0 (de 50 a 300)
        System.out.println(forno.ligado()); // false
        // os atributos temperatura e ligado devem ser inacessíveis (privados)
        // não deve compilar, verifique e depois comente as seguintes linhas
       // System.out.println(forno.temperatura);//metodos necessitam dos parenteses 
       // System.out.println(forno.ligado);//metodos necessitam dos parenteses 
        
        //
        System.out.println(forno.ligado() == false);
        forno.aumentarTemperatura(); // liga e vai para 50
        System.out.println(forno.ligado() == true);
        System.out.println(forno.temperatura() == 50); // 50
        forno.aumentarTemperatura();
        System.out.println(forno.temperatura() == 100); // 100
        forno.aumentarTemperatura();
        System.out.println(forno.temperatura() == 150); // 150
        forno.aumentarTemperatura();
        System.out.println(forno.temperatura() == 200); // 200
        forno.aumentarTemperatura();
        System.out.println(forno.temperatura() == 220); // 220
        forno.aumentarTemperatura();
        System.out.println(forno.temperatura() == 250); // 250
        forno.aumentarTemperatura();
        System.out.println(forno.temperatura() == 300); // 300
        
        forno.aumentarTemperatura(); // está no máximo
        System.out.println(forno.temperatura() == 300); // 300
        System.out.println(forno.ligado() == true);
        
        // reduzindo
        forno.diminuirTemperatura();
        forno.diminuirTemperatura();
        forno.diminuirTemperatura();
        System.out.println(forno.temperatura() == 200); // 200
        System.out.println(forno.temperatura()+"teste"); // 150
        
        // desligando direto
        forno.desligar();
        System.out.println(forno.ligado() == false);
        System.out.println(forno.temperatura() == 0);
        // já está desligado
        forno.diminuirTemperatura();
        System.out.println(forno.ligado() == false);
        System.out.println(forno.temperatura() == 0);
        
        // timer de 1 a 120 minutos
        forno.setTimer(15); // minutos
        forno.aumentarTemperatura();
        forno.aumentarTemperatura();
        forno.aumentarTemperatura();
        System.out.println(forno.ligado() == true);
        System.out.println(forno.temperatura() == 150);
        System.out.println(forno.tempoRestante() == 15);
        forno.tick(); // tick do timer (baixa 1min)
        
        System.out.println(forno.tempoRestante() == 14);
        forno.tick(); forno.tick(); forno.tick(); forno.tick();
        System.out.println(forno.tempoRestante() == 10);
        System.out.println(forno.ligado() == true);
        System.out.println(forno.temperatura() == 150);
        forno.tick(); forno.tick(); forno.tick(); forno.tick(); forno.tick();
        forno.tick(); forno.tick(); forno.tick(); forno.tick(); forno.tick();
        System.out.println(forno.tempoRestante() == 0);
        System.out.println(forno.ligado() == false);
        System.out.println(forno.temperatura() == 0);
        
        // novo timer
        forno.setTimer(120);
        forno.aumentarTemperatura(); forno.aumentarTemperatura();
        System.out.println(forno.ligado() == true);
        System.out.println(forno.temperatura() == 100);
        System.out.println(forno.tempoRestante() == 120);
        
        while (forno.ligado()) forno.tick(); // tic tac até desligar
        
        System.out.println(forno.tempoRestante() == 0);
        System.out.println(forno.ligado() == false);
        System.out.println(forno.temperatura() == 0);
        /*
        Modelar e implementar TV
        Considere um aparelho de televisão. Cada uma têm um fabricante, modelo, tamanho e resolução. Além disso, a operação da TV é bem simples, deve permitir aumentar e baixar o volume, numa escala de 0 a 100%, e mudar o canal, suportando apenas a faixa UHF, de 2 a 69.
        
        Dada essa especificação, modele, projete e implemente uma classe TV, que atenda às características mencionadas, respeitando a imutabilidade e os métodos comandos e consultas que representem as operações descritas. Escreva pelo menos 20 Casos de Teste, para situações comuns e excepcionais.
        // Desafio: implementar o mudo, ir para canal e voltar canal (não obrigatório).
        */
        Tv tv = new Tv("Sansung", "SM-2000", "50POL", "4k");
        tv.ligar();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();


        System.out.println(tv.volume());
        System.out.println(tv.volume() == 8);//true

        tv.subirCanal();
        tv.subirCanal();
        tv.subirCanal();
        System.out.println(tv.canal());//5

        tv.baixarCanal();
        System.out.println(tv.canal() == 4);//4


        tv.desligar();//desligado
      //  System.out.println(tv.ligado == false);//true
        tv.aumentarVolume();//0
        System.out.println("Volume: "+tv.volume());//0
        tv.aumentarVolume();
        tv.ligar();
        System.out.println("Volume: "+tv.volume());//5

        tv.mutar();
        System.out.println("Volume: "+tv.volume());//0
        System.out.println(tv.volume() == 0);//0
        tv.mutar();
        System.out.println("Volume: "+tv.volume());

        tv.irCanal(19);
        System.out.println("Canal: "+tv.canal());

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();

        System.out.println(tv.volume() == 13);//true
        System.out.println("Volume: " + tv.volume());
        System.out.println("Canal: "+ tv.canal());
        
        
    
        
    }
}