<html>
    <head/>
    <body>
        A data/hora atual � 
            <% 
                // isso � um scriptlet que imprime atributo chamado "dataHoraAtual" mas n�o cont�m l�gica da aplica��o
                out.print(request.getAttribute("nome")); 
            %>
            <br>
             <%=
                // isso � uma express�o que imprime atributo chamado "dataHoraAtual"
                request.getAttribute("nome")
            %>

            <br>
               ${nome}
            
    </body>
</html>
