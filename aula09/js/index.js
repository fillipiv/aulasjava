function fazerLogin(event){
    event.preventDefault() // evita o comportamento padrão de enviar um formulário
     
    //let user // declaração de variável em java script > antes usava var, agora usa mais let.
    let user = document.getElementById("inputUser").value // pega o componente do html > CAPTAR DADOS
    let password = document.getElementById("inputPassword").value
    // alert("Oi") // comentário java script - alert é o popoup da tela
    console.log('Você digitou ' + inputUser) // informação por tráS, logando no console

    let loginMsg = {
        email:user,
        cpf: user,
        password: password // quando a chave e valor são o mesmo nome, pode colocar só uma vez.
    }
    //document.getElementById("resultado").innerHTML = "<p>Olá " + inputUser + "</p>" // Concatenar e devolver na tela o campo "resultado" > APRESENTAR DADO

    //construindo a mensagem "msg" que será enviada ao Backend
    // method - indicado o método que será utilizado (GET, POST, DELETE...)
    // body - corpo da mensagem, o que deve ser enviado
    // headers - informando o tipo de conteúdo da mensagem
    let msg = {
        method: 'POST',
        body: JSON.stringify(loginMsg),
        headers:{
            'Content-type':'application/json'
        }
    }

    // fetch envia a 'msg' para o servidor e aguarda
    fetch("http://localhost:8080/user/login", msg)
        .then( res => tratarRetorno(res) ) //quando a resposta voltar...
//dentro do then está uma arrow function, função "anônima" que é chamada apenas uma vez, 
//e que a única coisa que faz é passar parÂmetro para outra.
}




function tratarRetorno(retorno){
    if(retorno.status == 200){
        document.getElementById("resultado").innerHTML = "<p> Login com sucesso! </p>"
        retorno.json().then(res => acessoPermitido(res))
        acessoPermitido()
    }else{
        document.getElementById("resultado").innerHTML = "<p> Falha no login! </p>"
    }
}

function acessoPermitido(user){
    localStorage.setItem("userLogged", JSON.stringify(user)) // método que gera no local storage um item (arquivo) que vai receber as informações do json
    window.location = "interna.html"
}