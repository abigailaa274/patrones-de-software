package creacionales.prototype;

//Paso 2: Implementar el Prototipo Concreto
//Cada subclase debe gestionar sus propios campos y llamar al constructor padre

public class Circulo extends Forma {
    public int radio;

    public Circulo() {}

    // Constructor de copia específico para Círculo
    public Circulo(Circulo target) {
        super(target); // Llama al constructor de Forma para copiar x, y, color
        if (target != null) {
            //(Esto evita un error si target es null, asegurando que solo se copie el radio cuando haya un objeto válido para copiar. Es una medida de seguridad para no intentar acceder a un campo de un objeto inexistente)
            this.radio = target.radio;
        }
    }

    @Override
    public Forma clonar() {
        // 3. El método clonar ejecuta el operador 'new' con el constructor de copia
        return new Circulo(this);
    }
}
