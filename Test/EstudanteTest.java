Aluno aluno;

    @BeforeEach
    public void setUp() {
        aluno = new Aluno();
    }

    // Aluno matriculado

    @Test
    public void naoDeveMatricularAlunoMatriculado() {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        assertEquals("Matrícula não realizada", aluno.matricular());
    }

    @Test
    public void deveFormarAlunoMatriculado() {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        assertEquals("Formatura realizada", aluno.formar());
    }

    @Test
    public void deveTrancarAlunoMatriculado() {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        assertEquals("Trancamento realizado", aluno.trancar());
    }

    @Test
    public void deveJubilarAlunoMatriculado() {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        assertEquals("Jubilamento realizado", aluno.jubilar());
    }

    @Test
    public void deveEvadirAlunoMatriculado() {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        assertEquals("Evasão realizada", aluno.evadir());
    }

    @Test
    public void deveTransferirAlunoMatriculado() {
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        assertEquals("Transferência realizada", aluno.transferir());
    }

}