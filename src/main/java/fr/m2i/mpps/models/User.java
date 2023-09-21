package fr.m2i.mpps.models;

	public class User {
		private String nom, prenom;
		
		

		public User(String nom, String prenom) {
			super();
			this.setNom(nom);
			this.setPrenom(prenom);
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		
		
	}

