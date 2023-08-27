package aula36;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaIni = sc.nextInt();
        int horaFim = sc.nextInt();
        int duracao;

        if (horaIni < horaFim) {
            duracao = horaFim - horaIni;
        } else {
            duracao = 24 - horaIni + horaFim;
        }

        System.out.printf("O jogo durou %d hora(s)", duracao);

        sc.close();
    }
}
