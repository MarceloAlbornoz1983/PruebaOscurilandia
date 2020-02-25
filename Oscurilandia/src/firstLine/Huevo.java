package firstLine;

public class Huevo {


		//private int[][] lanzamaientos;
		private int turno = 0;
		private int filaHuevo = 0;
		private int columnaHuevo = 0;
		
		public Huevo(int turno) {
			super();
			this.turno = turno;
		}
		
		public int getTurno() {
			return turno;
		}
		
		public void setTurno(int turno) {
			this.turno = turno;
		}
		
		public int getFilaHuevo() {
			return filaHuevo;
		}

		public void setFilaHuevo(int filaHuevo) {
			this.filaHuevo = filaHuevo;
		}

		public int getColumnaHuevo() {
			return columnaHuevo;
		}

		public void setColumnaHuevo(int columnaHuevo) {
			this.columnaHuevo = columnaHuevo;
		}
	}



