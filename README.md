# Pa4

Recursividad y su relación con divide y vencerás
La recursividad es una técnica de diseño algorítmico en la que una función o método se invoca a sí mismo para resolver un problema reduciéndolo progresivamente hacia casos más simples o elementales.

Relación con divide y vencerás
Recursividad: Es el mecanismo (o forma de auto-llamada) mediante el cual se descompone una tarea en instancias menores hasta alcanzar una solución directa.

Divide y vencerás: Es un paradigma que divide un problema en dos o más subproblemas del mismo tipo y menor tamaño, resuelve cada subproblema (usualmente de forma recursiva) y combina sus resultados para construir la solución final.

Aplicación en el campus: Permite particionar catálogos de ubicaciones, horarios o distancias para ordenarlos eficientemente, o dividir la exploración de zonas y rutas dentro de un campus universitario.

Caso base, caso recursivo y condición de finalización
Caso base:

if (current == null) return false;: se alcanzó el final de la secuencia de ubicaciones sin hallar la parada buscada.

if (current.locationId == targetLocationId) return true;: se encontró la ubicación solicitada en el nodo actual.

Caso recursivo:

return containsLocation(current.next, targetLocationId);: cuando el nodo actual no es nulo ni coincide con el objetivo, el método se llama a sí mismo avanzando al siguiente nodo de la ruta.

Condición de finalización:

Al operar sobre una cadena finita de nodos sin ciclos y avanzar un paso (current.next) en cada llamada, la recursión garantiza detenerse en un número finito de pasos al llegar a null o al encontrar targetLocationId.
