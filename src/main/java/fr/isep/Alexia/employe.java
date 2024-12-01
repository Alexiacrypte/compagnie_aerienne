package fr.isep.Alexia;

abstract  class Employe extends Personne{
        protected int NumeroEmploye;
                    int DateEmbauche ;
          protected  String Presonne (String nom , int identifiant, int adresse,
                              int contact, int numeroemploye, int dateembauche) {
              super (nom, identifiant,adresse, contact );
              this.DateEmbauche = DateEmbauche;
              this.NumeroEmploye = NumeroEmploye;
          }
          protected int getDateEmbauche() { return dateembauche;};
          protected int  getNumeeroEmploye()  {  return numeroemploye;};

          protected void setDateEmbauche( int Dateembauche)
          { this.dateembauche = dateembauche;};
          protected  void setNumeroEmploye ( int numeroemploye)
          {this.numeroemploye = numeroemploye;};

          abstract void Afficher();
}
