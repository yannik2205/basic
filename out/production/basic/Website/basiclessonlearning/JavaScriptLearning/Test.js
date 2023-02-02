var antwort = confirm("Wollen sie Ihren Namen nennen?");
if (antwort == true){
    var name = prompt("Geben sie Ihren Namen ein!");
    document.write("Hallo " + name + "!");
}