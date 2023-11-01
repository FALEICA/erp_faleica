(function init(){	
	
/*
=========================================
=== CONFIGURAÇÕES INICIAIS DO SISTEMA ===
=========================================
 */		
var tituloDoSistema = "-*-*-*-";
var nomeArquivoAvatar = "avatartest.png";

	
	
	
	
	
	
	
	
	
/*
==============================
=== CRIANDO TOPO DA PAGINA ===
==============================
 */	
	
var divHead = document.getElementById("rowHeader");
	
	var divAvatar = document.createElement("div");
	divAvatar.className = "col-2";
	divAvatar.id = "avatarCol";
		var imgAvatar = document.createElement("img");
		imgAvatar.src = "../img/"+nomeArquivoAvatar;
		imgAvatar.alt = "avatar";
		imgAvatar.style = "width: 55px; height: 70px; margin: 2px";
	
	var divBadge = document.createElement("div");
	divBadge.className = "col-6";
	divBadge.id = "badgeCol";
		var infoBadge = document.createElement("h5");
		infoBadge.textContent = "Informações que entrarão na badge";
	
	var divTitle = document.createElement("div");
	divTitle.className = "col-4";
	divTitle.id = "tituloCol";
		var headerTitle = document.createElement("h3");
		headerTitle.textContent = tituloDoSistema;
		headerTitle.id = "TituloSistema";
	
		
	
	divHead.appendChild(divAvatar);
	divHead.appendChild(divBadge);
	divHead.appendChild(divTitle);
		divAvatar.appendChild(imgAvatar);
		divBadge.appendChild(infoBadge);
		divTitle.appendChild(headerTitle);
	
	
	
	
	




		
/*
==============================
=== CRIANDO MENU DA PAGINA ===
==============================
 */			
		
var divColMenu = document.getElementById("colMenu");
	
	
	var grupoBotoes = document.createElement("div");
		grupoBotoes.className = "btn-group dropend";
		
		var btn01 = document.createElement("button");
			btn01.type = "button";
			btn01.className = "btn btn-secondary dropdown-toogle";
			btn01.toggleAttribute = "dropdown";
			btn01.ariaExpanded = "false";
			btn01.textContent = "ADM SISTEMA"
			
			var ul = document.createElement("ul");
				ul.className = "dropdown-menu"
				
				var li01 = document.createElement("li");
					var a01 = document.createElement("a");
						a01.className = "dropdown-item";
						a01.href = "#MAIN";
						a01.textContent = "Cadastro de Usuarios"					
			
		
	

divColMenu.appendChild(grupoBotoes);
grupoBotoes.appendChild(btn01);
divColMenu.appendChild(ul);
ul.appendChild(li01);
li01.appendChild(a01);

		


/*
==========================================
=== CRIANDO RODAPE OU FOOTER DA PAGINA ===
==========================================
 */	

	
	
	
})();