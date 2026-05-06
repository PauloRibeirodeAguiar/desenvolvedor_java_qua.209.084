const form = document.querySelector('form');

form.addEventListener('submit', function(event) {
    event.preventDefault(); // Evita o envio do formulário  

    let nome = document.getElementById('nome').value;

    alert('Olá, ' + nome + '! Bem-vindo ao JavaScript!');

    form.reset(); // Limpa os campos do formulário
});
