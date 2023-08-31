
const sortearBtn = document.getElementById("sortear");
        const resultadoSorteio = document.getElementById("resultados");

        sortearBtn.addEventListener("click", () =>{
            fetch("http://localhost:8080/sortear-numeros")
            .then(response => response.json())
            .then(numerosSorteados => {
                resultadoSorteio.innerHTML = `Números Sorteados: ${numerosSorteados.join(", ")}`;
            })
            .catch(error => {
                console.error("Erro ao buscar números: ", error);
            });
        });