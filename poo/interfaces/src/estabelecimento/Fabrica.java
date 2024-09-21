package estabelecimento;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultiFuncional;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
		Deskjet deskjet = new Deskjet();
		Scanner scanner = new Scanner();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = scanner;
		Copiadora copiadora = em;
		 	
		
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
	}
}
