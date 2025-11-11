package unidade2.abstrata.consulta;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

class Paciente {
    private int rg;
    private int idade;

    public Paciente(int rg, int idade) {
        this.rg = rg;
        this.idade = idade;
    }

    public int getRg() {
        return rg;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Paciente(RG: " + rg + ", Idade: " + idade + ")";
    }
}

public class SimulacaoConsultorio {

    public static void main(String[] args) {

        System.out.println("--- Simulando o dia de atendimento do consultório ---");

        Queue<Paciente> filaPrioritaria = new LinkedList<>();
        Queue<Paciente> filaComum = new LinkedList<>();
        
        Random random = new Random(); 

        int minutoAtual = 0;
        int pacientesAtendidos = 0;
        int limitePacientesDia = 20;

        int tempoProximaChegada = 0;
        int tempoFimConsulta = -1;
        boolean medicoOcupado = false;

        while (pacientesAtendidos < limitePacientesDia) {

            if (minutoAtual == tempoProximaChegada) {
                int novaIdade = random.nextInt(96);
                int novoRg = 1000000 + random.nextInt(9000000);
                
                Paciente novoPaciente = new Paciente(novoRg, novaIdade);
                
                if (novoPaciente.getIdade() > 60) {
                    filaPrioritaria.add(novoPaciente);
                    System.out.println("Minuto " + minutoAtual + ": " + novoPaciente + " chegou e foi para a fila PRIORITÁRIA.");
                } else {
                    filaComum.add(novoPaciente);
                    System.out.println("Minuto " + minutoAtual + ": " + novoPaciente + " chegou e foi para a fila COMUM.");
                }
                
                tempoProximaChegada += 4;
            }

            if (medicoOcupado && minutoAtual == tempoFimConsulta) {
                medicoOcupado = false;
                pacientesAtendidos++;
                System.out.println("Minuto " + minutoAtual + ": Doutor terminou a consulta. (Total atendidos: " + pacientesAtendidos + "/" + limitePacientesDia + ")");
            }

            if (!medicoOcupado && (!filaPrioritaria.isEmpty() || !filaComum.isEmpty())) {
                
                Paciente pacienteChamado = null;
                String origemFila = "";

                if (!filaPrioritaria.isEmpty()) {
                    pacienteChamado = filaPrioritaria.poll();
                    origemFila = "PRIORITÁRIA";
                } else {
                    pacienteChamado = filaComum.poll();
                    origemFila = "COMUM";
                }
                
                medicoOcupado = true;
                tempoFimConsulta = minutoAtual + 5;
                
                System.out.println("Minuto " + minutoAtual + ": Doutor chamando " + pacienteChamado + " da fila " + origemFila + ".");
                System.out.println("               (Consulta terminará no minuto " + tempoFimConsulta + ")");
            }
            
            minutoAtual++;
        }
        
        System.out.println("\n--- Simulação Concluída ---");
        System.out.println("O consultório atendeu os " + pacientesAtendidos + " pacientes do dia.");
        System.out.println("O dia de trabalho terminou no minuto: " + (minutoAtual - 1));
        System.out.println("Pacientes restantes na fila prioritária: " + filaPrioritaria.size());
        System.out.println("Pacientes restantes na fila comum: " + filaComum.size());
    }
}