
function checkMail(){
		let  email = "exa-mple@example.com";
		let atSymbol = false;
		let dotSymbol = false;
		let atIndex = -1;
		let dotIndex = -1;

		for (let i = 0; i < email.length; i++) {
			
			if (email[i]!= '@' && (email[i]<'a'||email[i]>'z')) {
				console.log("ivalide");
				return ;
			}
			
			if (email[i] == '@') {
				if (atSymbol) 
				{
					console.log("ivalide");
					return ;
				}
				atSymbol = true;
				atIndex = i;
			}
			
			if (email[i] == '.') {
				dotSymbol = true;
				dotIndex = i;
			}
		}

		if (!atSymbol || atIndex == 0 || atIndex == email.length - 1) {
			console.log("ivalide");
			return ;
		}
		
		if (!dotSymbol || dotIndex <= atIndex + 1 || dotIndex == email.length - 1) {
			console.log("ivalide");
			return ;
		}

		console.log("valide");
	}
