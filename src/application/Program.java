package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Pessoa;

public class Program {
	
	static Integer unidadeAvaliada = 0;
	
	public static void main(String[] args) {

		ArrayList<Pessoa> data = new ArrayList<Pessoa>();
		
		Scanner sc = new Scanner(System.in);
		
		//LOADING
		System.out.println("Leitura de tabela");
		
		//Nome,Cargo, Destino, Origem;
		data.add(new Pessoa(4,1,75,74));
		data.add(new Pessoa(7,1,75,59));
		data.add(new Pessoa(13,1,75,19));
		data.add(new Pessoa(16,1,75,58));
		data.add(new Pessoa(17,1,75,38));
		data.add(new Pessoa(18,1,75,32));
		data.add(new Pessoa(24,1,75,23));
		data.add(new Pessoa(28,1,75,36));
		data.add(new Pessoa(29,1,75,87));
		data.add(new Pessoa(30,1,75,20));
		data.add(new Pessoa(36,1,75,65));
		data.add(new Pessoa(38,1,75,54));
		data.add(new Pessoa(42,1,75,90));
		data.add(new Pessoa(46,1,75,78));
		data.add(new Pessoa(52,1,75,59));
		data.add(new Pessoa(56,1,8,87));
		data.add(new Pessoa(57,1,75,51));
		data.add(new Pessoa(63,1,75,76));
		data.add(new Pessoa(66,1,75,90));
		data.add(new Pessoa(70,1,75,63));
		data.add(new Pessoa(72,1,75,38));
		data.add(new Pessoa(74,1,75,50));
		data.add(new Pessoa(80,1,75,68));
		data.add(new Pessoa(81,1,75,18));
		data.add(new Pessoa(82,1,75,4));
		data.add(new Pessoa(83,1,75,83));
		data.add(new Pessoa(88,1,75,6));
		data.add(new Pessoa(89,1,75,24));
		data.add(new Pessoa(92,1,75,46));
		data.add(new Pessoa(94,1,75,20));
		data.add(new Pessoa(99,1,62,19));
		data.add(new Pessoa(100,1,63,4));
		data.add(new Pessoa(102,1,64,19));
		data.add(new Pessoa(103,1,65,9));
		data.add(new Pessoa(108,1,66,29));
		data.add(new Pessoa(109,1,67,80));
		data.add(new Pessoa(114,1,68,73));
		data.add(new Pessoa(120,1,69,51));
		data.add(new Pessoa(126,1,70,12));
		data.add(new Pessoa(130,1,71,16));
		data.add(new Pessoa(134,1,72,70));
		data.add(new Pessoa(135,1,73,64));
		data.add(new Pessoa(138,1,74,54));
		data.add(new Pessoa(142,1,75,58));
		data.add(new Pessoa(143,1,76,88));
		data.add(new Pessoa(145,1,77,78));
		data.add(new Pessoa(153,1,78,73));
		data.add(new Pessoa(157,1,59,4));
		data.add(new Pessoa(164,1,60,79));
		data.add(new Pessoa(166,1,61,67));
		data.add(new Pessoa(170,1,62,67));
		data.add(new Pessoa(171,1,91,20));
		data.add(new Pessoa(174,1,64,53));
		data.add(new Pessoa(176,1,65,77));
		data.add(new Pessoa(178,1,66,25));
		data.add(new Pessoa(183,1,67,78));
		data.add(new Pessoa(184,1,68,43));
		data.add(new Pessoa(185,1,69,13));
		data.add(new Pessoa(190,1,70,16));
		data.add(new Pessoa(191,1,71,32));
		data.add(new Pessoa(193,1,72,57));
		data.add(new Pessoa(198,1,73,39));
		data.add(new Pessoa(199,1,74,24));
		data.add(new Pessoa(206,1,75,70));
		data.add(new Pessoa(208,1,75,91));
		data.add(new Pessoa(210,1,77,23));
		data.add(new Pessoa(212,1,78,65));
		data.add(new Pessoa(219,1,59,21));
		data.add(new Pessoa(224,1,60,90));
		data.add(new Pessoa(225,1,61,74));
		data.add(new Pessoa(228,1,62,79));
		data.add(new Pessoa(231,1,63,13));
		data.add(new Pessoa(236,1,64,86));
		data.add(new Pessoa(238,1,65,29));
		data.add(new Pessoa(242,1,66,91));
		data.add(new Pessoa(246,1,58,75));
		data.add(new Pessoa(253,1,68,69));
		data.add(new Pessoa(254,1,69,9));
		data.add(new Pessoa(255,1,70,85));
		data.add(new Pessoa(256,1,71,39));
		data.add(new Pessoa(257,1,72,19));
		data.add(new Pessoa(258,1,73,10));
		data.add(new Pessoa(266,1,74,3));
		data.add(new Pessoa(268,1,75,58));
		data.add(new Pessoa(269,1,76,3));
		data.add(new Pessoa(270,1,77,20));
		data.add(new Pessoa(272,1,78,84));
		data.add(new Pessoa(273,1,79,19));
		data.add(new Pessoa(274,1,80,90));
		data.add(new Pessoa(278,1,81,88));
		data.add(new Pessoa(279,1,82,72));
		data.add(new Pessoa(285,1,83,73));
		data.add(new Pessoa(287,1,84,52));
		data.add(new Pessoa(293,1,85,82));
		data.add(new Pessoa(295,1,86,60));
		data.add(new Pessoa(297,1,29,31));
		data.add(new Pessoa(298,1,88,37));
		data.add(new Pessoa(300,1,90,10));
		data.add(new Pessoa(301,1,91,63));
		data.add(new Pessoa(302,1,79,56));
		data.add(new Pessoa(325,1,80,29));
		data.add(new Pessoa(331,1,81,20));
		data.add(new Pessoa(332,1,82,2));
		data.add(new Pessoa(336,1,83,20));
		data.add(new Pessoa(337,1,84,24));
		data.add(new Pessoa(339,1,85,82));
		data.add(new Pessoa(343,1,86,69));
		data.add(new Pessoa(345,1,87,64));
		data.add(new Pessoa(346,1,88,30));
		data.add(new Pessoa(348,1,90,16));
		data.add(new Pessoa(352,1,91,19));
		data.add(new Pessoa(355,1,79,19));
		data.add(new Pessoa(356,1,80,78));
		data.add(new Pessoa(358,1,81,37));
		data.add(new Pessoa(361,1,82,67));
		data.add(new Pessoa(366,1,83,24));
		data.add(new Pessoa(369,1,84,85));
		data.add(new Pessoa(370,1,85,4));
		data.add(new Pessoa(373,1,86,5));
		data.add(new Pessoa(375,1,87,84));
		data.add(new Pessoa(382,1,88,62));
		data.add(new Pessoa(384,1,90,8));
		data.add(new Pessoa(387,1,91,18));
		data.add(new Pessoa(391,1,79,19));
		data.add(new Pessoa(392,1,80,53));
		data.add(new Pessoa(393,1,23,29));
		data.add(new Pessoa(394,1,82,86));
		data.add(new Pessoa(395,1,83,80));
		data.add(new Pessoa(396,1,84,60));
		data.add(new Pessoa(404,1,85,76));
		data.add(new Pessoa(407,1,86,81));
		data.add(new Pessoa(410,1,87,20));
		data.add(new Pessoa(415,1,88,19));
		data.add(new Pessoa(418,1,90,56));
		data.add(new Pessoa(423,1,91,18));
		data.add(new Pessoa(431,1,1,76));
		data.add(new Pessoa(432,1,2,46));
		data.add(new Pessoa(437,1,3,82));
		data.add(new Pessoa(438,1,4,20));
		data.add(new Pessoa(442,1,5,9));
		data.add(new Pessoa(451,1,6,70));
		data.add(new Pessoa(453,1,7,50));
		data.add(new Pessoa(454,1,8,71));
		data.add(new Pessoa(456,1,9,1));
		data.add(new Pessoa(464,1,10,84));
		data.add(new Pessoa(469,1,12,5));
		data.add(new Pessoa(470,1,13,20));
		data.add(new Pessoa(473,1,16,16));
		data.add(new Pessoa(477,1,18,64));
		data.add(new Pessoa(478,1,19,83));
		data.add(new Pessoa(482,1,20,18));
		data.add(new Pessoa(484,1,21,66));
		data.add(new Pessoa(485,1,22,73));
		data.add(new Pessoa(486,1,23,61));
		data.add(new Pessoa(489,1,24,19));
		data.add(new Pessoa(494,1,25,26));
		data.add(new Pessoa(495,1,26,68));
		data.add(new Pessoa(501,1,29,91));
		data.add(new Pessoa(502,1,30,33));
		data.add(new Pessoa(504,1,31,13));
		data.add(new Pessoa(509,1,32,22));
		data.add(new Pessoa(510,1,26,75));
		data.add(new Pessoa(512,1,2,76));
		data.add(new Pessoa(514,1,3,35));
		data.add(new Pessoa(517,1,4,6));
		data.add(new Pessoa(526,1,5,83));
		data.add(new Pessoa(531,1,6,26));
		data.add(new Pessoa(533,1,7,79));
		data.add(new Pessoa(534,1,20,26));
		data.add(new Pessoa(538,1,9,20));
		data.add(new Pessoa(539,1,10,52));
		data.add(new Pessoa(541,1,12,54));
		data.add(new Pessoa(545,1,13,18));
		data.add(new Pessoa(547,1,16,26));
		data.add(new Pessoa(553,1,18,45));
		data.add(new Pessoa(554,1,19,1));
		data.add(new Pessoa(561,1,20,81));
		data.add(new Pessoa(562,1,21,59));
		data.add(new Pessoa(563,1,22,18));
		data.add(new Pessoa(568,1,23,16));
		data.add(new Pessoa(570,1,24,61));
		data.add(new Pessoa(571,1,25,83));
		data.add(new Pessoa(574,1,26,44));
		data.add(new Pessoa(575,1,29,9));
		data.add(new Pessoa(580,1,30,88));
		data.add(new Pessoa(584,1,31,19));
		data.add(new Pessoa(585,1,32,67));
		data.add(new Pessoa(588,1,1,90));
		data.add(new Pessoa(590,1,2,52));
		data.add(new Pessoa(594,1,3,73));
		data.add(new Pessoa(595,1,4,69));
		data.add(new Pessoa(599,1,5,22));
		data.add(new Pessoa(601,1,6,69));
		data.add(new Pessoa(603,1,7,7));
		data.add(new Pessoa(604,1,8,60));
		data.add(new Pessoa(606,1,9,38));
		data.add(new Pessoa(612,1,10,74));
		data.add(new Pessoa(617,1,12,90));
		data.add(new Pessoa(620,1,13,38));
		data.add(new Pessoa(624,1,16,1));
		data.add(new Pessoa(627,1,18,83));
		data.add(new Pessoa(628,1,19,42));
		data.add(new Pessoa(631,1,20,57));
		data.add(new Pessoa(636,1,21,45));
		data.add(new Pessoa(640,1,22,4));
		data.add(new Pessoa(642,1,23,36));
		data.add(new Pessoa(643,1,24,65));
		data.add(new Pessoa(645,1,25,56));
		data.add(new Pessoa(646,1,26,66));
		data.add(new Pessoa(649,1,29,20));
		data.add(new Pessoa(650,1,30,23));

		System.out.print("Declare a unidade a ser avaliada: ");
		unidadeAvaliada = sc.nextInt();

		//Aqui vou procurar as combinações da unidade.
		String trace = "";
		rastreio(unidadeAvaliada,trace,0,data);
	
		System.out.println();
		System.out.print("Deseja recomeçar? (s/n) : ");
		char c = sc.next().charAt(0);
		
		if (c == 's') {
			main(args);
		}
		
		sc.close();
	}

	//================== FUNÇÃO DE RASTREIO =================
	//n = unidade avaliada
	static int profundidade = 0;

	public static void rastreio(Integer n, String trace,int profundidade,ArrayList<Pessoa> data) {

		if(profundidade <= 8) {
			//CRITÉRIO DE PARADA
			if(n == unidadeAvaliada && trace != "") {
				System.out.println(trace);
				return;
			}
			
			for (Pessoa x: data) {
				
				if(x.destino == n) {
					String trace2 = trace + " > " + x.toString(); 
					int profundidade2 = profundidade +1;
					ArrayList<Pessoa> data2 = (ArrayList<Pessoa>) data.clone();
					data2.remove(x);
					rastreio(x.atual,trace2, profundidade2,data2);
				}
			}
		}
	}
	
	


}