package Cadeia01.Parte9.SistemadeTriagemHospitalarAvançado;

public class main {
    public static int proximoPaciente(String nome[],
                                      int idade[],
                                      boolean vip[],
                                      double temperatura[],
                                      int batimentos[],
                                      int pressaoSistolica[],
                                      int pessaoDiastolica[],
                                      int saturacao[],
                                      boolean sangramento[],
                                      boolean dorPeito[],
                                      boolean faltaAr[],
                                      int tempoEsperaMin[],
                                      int prioridadeManual[],
                                      boolean chegouAmbulancia[],
                                      double peso[],
                                      double altura[],
                                      int historicoInternacoes[],
                                      boolean alerggiaMedicamentos[],
                                      boolean atendido[]) {
        int indice = 0;
        return indice;
    }

    public static void main(String[] args) {
        String nome[] = {
                "João", "Maria", "Carlos", "Ana", "Pedro",
                "Julia", "Marcos", "Fernanda", "Lucas", "Paula"
        };

        int idade[] = {
                65, 34, 50, 22, 80,
                40, 55, 70, 29, 60
        };

        boolean vip[] = {
                false, true, false, false, true,
                false, false, true, false, false
        };

        double temperatura[] = {
                37.2, 39.5, 36.8, 38.0, 37.0,
                40.2, 36.5, 37.8, 39.1, 36.9
        };

        int batimentos[] = {
                90, 130, 85, 100, 160,
                110, 95, 88, 140, 92
        };

        int pressaoSistolica[] = {
                120, 140, 110, 130, 190,
                125, 118, 135, 145, 122
        };

        int pressaoDiastolica[] = {
                80, 90, 70, 85, 100,
                82, 75, 88, 92, 80
        };

        int saturacao[] = {
                98, 93, 97, 96, 85,
                92, 99, 95, 89, 97
        };

        boolean sangramento[] = {
                false, false, false, false, true,
                false, false, false, false, false
        };

        boolean inconsciente[] = {
                false, false, false, false, false,
                false, false, true, false, false
        };

        boolean dorPeito[] = {
                false, true, false, false, true,
                false, false, false, true, false
        };

        boolean faltaAr[] = {
                false, true, false, false, true,
                false, false, false, true, false
        };

        int tempoEsperaMin[] = {
                20, 70, 10, 40, 5,
                90, 15, 30, 80, 25
        };

        int prioridadeManual[] = {
                0, 0, 0, 0, 0,
                0, 0, 0, 0, 0
        };

        boolean chegouAmbulancia[] = {
                false, false, false, false, true,
                false, false, false, false, false
        };

        double peso[] = {
                80, 65, 90, 55, 70,
                60, 85, 75, 68, 72
        };

        double altura[] = {
                1.75, 1.65, 1.80, 1.60, 1.70,
                1.68, 1.78, 1.72, 1.69, 1.74
        };

        int historicoInternacoes[] = {
                2, 1, 5, 0, 3,
                1, 4, 2, 0, 6
        };

        boolean alergiaMedicamento[] = {
                false, true, false, false, false,
                true, false, false, true, false
        };

        boolean atendido[] = {
                false, false, false, false, false,
                false, false, false, false, false
        };
        int indice = proximoPaciente(
                nome,
                idade,
                vip,
                temperatura,
                batimentos,
                pressaoSistolica,
                pressaoDiastolica,
                saturacao,
                sangramento,
                inconsciente,
                dorPeito,
                faltaAr,
                tempoEsperaMin,
                prioridadeManual,
                chegouAmbulancia,
                peso,
                altura,
                historicoInternacoes,
                alergiaMedicamento,
                atendido,
                atendidosNestaHora
        );

        System.out.println("Paciente escolhido: " + nome[indice]);

    }
}
