import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ProcessoSeletivo {
    public static void main(String[] args) {

        selecaoCandidatos();

    }
    static void selecaoCandidatos(){
        String [] candidatos = {"LAURO","MATEUS", "MORGANA", "FLAUSINO", "OTAVIO","DUDA","LUIS","GEOVANA","MARIA"};
        ArrayList<String> candidatosAprovados = new ArrayList<>();
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados<5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = getRandomDouble();
            if(salarioBase >= salarioPretendido){
                candidatosSelecionados ++;
                candidatosAprovados.add(candidato);
                System.out.println(candidatos[candidatoAtual]);
                System.out.println(salarioPretendido);
            }
            System.out.println(candidatos[candidatoAtual]);
            System.out.println(candidatosAprovados);
            System.out.println(candidatosAprovados.size());
            candidatoAtual ++;
        }
    }

    public static double getRandomDouble() {
        // Math.random() gera um número entre 0.0 e 1.0
        // Multiplicando por 400.0 gera um número entre 0.0 e 400.0, depois adiciona 1800.0
        return 1800.0 + (Math.random() * 400.0);
    }

    static void processoSeletivo(double salarioPretendido){
        float salarioBase = 2000;
        if(salarioBase>salarioPretendido){
            System.out.println("Ligar para candidato.");
        } else if (salarioBase==salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta.");
        } else {
            System.out.println("Aguardando resultado demais candidatos.");
        }
    }
}