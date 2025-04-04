const BASE_URL = 'https://restcountries.com/v3.1/all';



window. onload = function () {
    getCountries()
}


function getCountries() {

callAPI(BASE_URL, function (status, data) {

        data.forEach((country) => {
            const { name, population, capital, flags, maps } = country; 
        
            document.getElementById("content").innerHTML +=   
            `<article class="country-container">
                    <img src="${flags.png}" alt="Bandeira de ${name.common}" />
                    <div class="country-info">
                        <p><strong>Nome:</strong> ${name.common}</p>
                        <p><strong>Capital:</strong> ${capital ? capital[0] : "Não disponível"}</p>
                        <p><strong>População:</strong> ${population.toLocaleString()}</p>
                        <a href="${maps.googleMaps}">Ver no Mapa</a>
                    </div>
            </article>`;

})})}


function callAPI(url, callback) {
    let xhr = new XMLHttpRequest();
    xhr.open('GET', url, true);
    xhr. responseType = 'json';
    xhr.onload = function () {
        let status = xhr.status;
        if (status === 200) {
        callback(status, xhr.response);
        } else {
        alert("Problemas ao conectar o servidor")
        
        }
        
    }
    xhr.send();
    
}

