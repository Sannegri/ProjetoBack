package projetoback.teste;

public enum Sexo {
   NOT_SPECIFIED("", "Not Specified"),
   MALE("M", "Male"),
   FEMALE("F", "Male");
    private final String tag;
    private final String descricao;

   Sexo(String tag, String descricao) {
      this.tag = tag;
      this.descricao = descricao;
   }

   public String getTag() {
      return tag;
   }

   public static Sexo fromTag(String tag) {
      for (Sexo sexo : Sexo.values()) 
         if (sexo.getTag().equals(tag))
            return sexo;

      return NOT_SPECIFIED;
   }

   public boolean valido() {
      return this != NOT_SPECIFIED;
   }

   public String toString() {
      return getDescricao();
   }

    private String getDescricao() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
