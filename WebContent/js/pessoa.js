
//Função que mostra os dados da pessoa
function mostrarPessoa(){
  var xhttp = new XMLHttpRequest();
  xhttp.open("GET", "./pessoaSv", true);
  xhttp.send();
  xhttp.onreadystatechange = function() {
    if(xhttp.readyState == 4 && xhttp.status == 200) {
    	
    	//Exemplo 1
//    	document.getElementById("pessoa").value = xhttp.responseText;
    	
    	//exemplo 2
//    	pessoa = JSON.parse(xhttp.responseText);
//    	document.getElementById("pessoa").value = pessoa[0].nome;
    	
    	//Exemplo 3
    	pessoa = JSON.parse(xhttp.responseText);
    	for(p in pessoa){
    		for(a in p){
    			document.getElementById("pessoa").value += pessoa[p[a]].nome+" ";
    		}
    	}
    }
    else if(xhttp.readyState == 4 && xhttp.status == 500) {
    	alert("Erro ao processamento");
    }
  };
}
