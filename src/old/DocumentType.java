package old;

public enum DocumentType {
    INVOICE(1), CONTRACT(2), CERTIFICATE(3), NOTARIAL_ACT(4);


    private int id;

    DocumentType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
