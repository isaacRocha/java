<html>
    <head/>
    <body>
        A data/hora atual é 
            <% 
                // isso é um scriptlet que imprime atributo chamado "dataHoraAtual" mas não contém lógica da aplicação
                out.print(request.getAttribute("nome")); 
            %>
            <br>
             <%=
                // isso é uma expressão que imprime atributo chamado "dataHoraAtual"
                request.getAttribute("nome")
            %>

            <br>
               ${nome}
            
    </body>
</html>
