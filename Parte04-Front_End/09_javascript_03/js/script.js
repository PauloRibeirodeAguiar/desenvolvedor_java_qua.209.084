const form = document.querySelector('form');

const maioridade = () => {    

    let nome = document.querySelector('#nome').value;
    let idade = Number(document.querySelector('#idade').value);

    if (!nome || isNaN(idade)) {
        document.querySelector('#result').innerHTML = 'Preencha corretamente os campos.';
        return;
    }

    if (idade >= 18) {
        document.querySelector('#result').innerHTML = `Olá, ${nome}! Você é maior de idade.`;
    } else {
        document.querySelector('#result').innerHTML = `Olá, ${nome}! Você não é maior de idade.`;
    }

    form.reset();
}

form.addEventListener('submit', function(event) {
    event.preventDefault(); 
    maioridade();
});