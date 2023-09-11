function init(){	
	
	var mainBody = document.body;
	
		var container = document.createElement("div");
		container.className = "container-fluid";

/*=====================================================================*/		
/*==== CABEÇALHO DA PAGINA ============================================*/
/*=====================================================================*/
		
			var rowHeader = document.createElement("div");
			rowHeader.className = "row";
			rowHeader.id = "rowHeader";
			
				var divAvatar = document.createElement("div");
				divAvatar.className = "col-3";
				divAvatar.id = "avatarCol";
				
					var imgProfile = document.createElement("img");
					imgProfile.src = "../../../img/avatartest.png";
					imgProfile.alt = "img profile";
					imgProfile.style = "width: 55px; height: 70px; margin: 2px";
						
						
						
				var badgeCol = document.createElement("div");
				badgeCol.className = "col-6";
				badgeCol.id = "badgeCol";
					var infoBadge = document.createElement("h5");
					infoBadge.textContent = "Informações da badge";
					
				
				var titleSystem = document.createElement("div");
				titleSystem.className = "col-3";
				titleSystem.id = "tituloCol";
					var tituloCol = document.createElement("h3");
					tituloCol.id = "TituloSistema";
					tituloCol.textContent = "SIGTEXTUS";

/*=====================================================================*/		
/*==== CORPO DA PAGINA - COLUNA MENU E COLUNA CONTEUDO ================*/
/*=====================================================================*/
			var rowConteudo = document.createElement("div");
			rowConteudo.className = "row";
			
				var divColMenu = document.createElement("div");
				divColMenu.className = "col-3";
				divColMenu.id = "colMenu";
				
					var ul = document.createElement("ul");
						var li_01 = document.createElement("li");
							var sistema = document.createElement("a");
							sistema.href = "sistema/cadastros/syscmp001cadastrousuarios.xhtml";
							sistema.textContent = "ADMINISTRAÇÃO DO SISTEMA";
						
						var li_02 = document.createElement("li");
							var pessoas = document.createElement("a");
							pessoas.href = "#pessoas";
							pessoas.textContent = "PESSOAS";
							
						var li_03 = document.createElement("li");
							var produto = document.createElement("a");
							produto.href = "#produto";
							produto.textContent = "PRODUTOS";
							
						var li_04 = document.createElement("li");
							var fiscal = document.createElement("a");
							fiscal.href = "#fiscal";
							fiscal.textContent = "FISCAL";
						
						var li_05 = document.createElement("li");
							var financ = document.createElement("a");
							financ.href = "#financeiro";
							financ.textContent = "FINANCEIRO";
							
						var li_06 = document.createElement("li");
							var contabil = document.createElement("a");
							contabil.href = "#contabilidade";
							contabil.textContent = "CONTABILIDADE";
						
						
				
					
				
				
				var divColConteudo = document.createElement("div");
				divColConteudo.className = "col-9";
				divColConteudo.id = "colConteudo";
					
						
	
	
	
/*=====================================================================*/		
/*==== RESUMO FINAL DAS AMARRAÇÕES ENTRE ELEMENTOS ++++================*/
/*=====================================================================*/
	
	mainBody.appendChild(container);
	
		container.appendChild(rowHeader);	
			rowHeader.appendChild(divAvatar);
			rowHeader.appendChild(badgeCol);
			rowHeader.appendChild(titleSystem);
				divAvatar.appendChild(imgProfile);
				badgeCol.appendChild(infoBadge);
				titleSystem.appendChild(tituloCol);
				
		container.appendChild(rowConteudo);
			rowConteudo.appendChild(divColMenu);
				divColMenu.appendChild(ul);
					ul.appendChild(li_01);
					ul.appendChild(li_02);
					ul.appendChild(li_03);
					ul.appendChild(li_04);
					ul.appendChild(li_05);
					ul.appendChild(li_06);
						li_01.appendChild(sistema);
						li_02.appendChild(pessoas);
						li_03.appendChild(produto);
						li_04.appendChild(fiscal);
						li_05.appendChild(financ);
						li_06.appendChild(contabil);
					
			
			rowConteudo.appendChild(divColConteudo);
			
				 
		 

	
	
			
	
	
	
};