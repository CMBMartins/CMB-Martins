<!DOCTYPE html>
<html>
<head>
    <title>Formulário de Dados Pessoais</title>
    <style>
        /* Estilos para modais */
        .modal {
            display: none;
            position: fixed;
            z-index: 1;
            left: 0;
            top: 0;
            width: 100%;
            height: 100%;
            background-color: rgba(0,0,0,0.7);
        }

        .modal-content {
            background-color: #fff;
            margin: 10% auto;
            padding: 20px;
            width: 60%;
            border-radius: 5px;
        }

        .close {
            color: #888;
            float: right;
            font-size: 28px;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <h1>Formulário de Ativos Familiar</h1>

    <form id="dadosPessoaisForm">
        <label for="nome">Nome:</label>
        <input type="text" name="nome" id="nome" required>

        <label for="email">E-mail:</label>
        <input type="email" name="email" id="email" required>

        <label for="contato">Contato Telefônico:</label>
        <input type="text" name="contato" id="contato" required>

        <label for="bem">Descrição do Bem:</label>
        <input type="bem" name="bem" id="bem" required>

        <label for="documento">Numero do Documento:</label>
        <input type="documento" name="documento" id="documento" required>

        <!-- Adicione mais campos para outros dados pessoais aqui -->

        <button type="submit">Salvar</button>
    </form>

    <!-- Modais para exibir os dados -->
    <div id="formacaoModal" class="modal">
        <div class="modal-content">
            <span class="close" onclick="fecharModal('formacaoModal')">&times;</span>
            <h2>Formação Acadêmica</h2>
            <div id="formacaoContent"></div>
        </div>
    </div>

    <div id="experienciaModal" class="modal">
        <div class="modal-content">
            <span class="close" onclick="fecharModal('experienciaModal')">&times;</span>
            <h2>Experiência Profissional</h2>
            <div id="experienciaContent"></div>
        </div>
    </div>

    <!-- Adicione mais modais para cursos, habilidades, etc. -->

    <!-- Botões para abrir modais -->
    <button onclick="abrirModal('formacaoModal')">Ver Formação Acadêmica</button>
    <button onclick="abrirModal('experienciaModal')">Ver Experiência Profissional</button>
</body>
<script>
    // Função para abrir um modal
    function abrirModal(modalId) {
        var modal = document.getElementById(modalId);
        modal.style.display = "block";
        // Aqui você pode carregar os dados no modal com JavaScript
    }

    // Função para fechar um modal
    function fecharModal(modalId) {
        var modal = document.getElementById(modalId);
        modal.style.display = "none";
    }

    // Evento para enviar dados do formulário
    document.getElementById("dadosPessoaisForm").addEventListener("submit", function (event) {
        event.preventDefault();
        // Coletar os dados do formulário
        var nome = document.getElementById("nome").value;
        var email = document.getElementById("email").value;
        var contato = document.getElementById("contato").value;
        var bem = document.getElementById("bem").value;
        var documento = document.getElementById("documento").value;    

        // Exemplo: Mostrar dados de formação acadêmica no modal
        var formacaoContent = document.getElementById("formacaoContent");
        formacaoContent.innerHTML = "Nome: " + nome + "<br>Email: " + email + "<br>Contato Telefônico: " + contato + "<br>Descrição do Bem: " + bem +;

        // Outros dados podem ser atualizados de maneira semelhante

        // Fechar o modal de dados pessoais
        fecharModal("dadosPessoaisModal");
    });
</script>
</html>
