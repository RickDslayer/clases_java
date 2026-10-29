# Sesión 10 · Solución de los labs

Ejecutado con JDK 21. Las clases de dominio no se modificaron: las comprobaciones están en una copia del Main de cada paquete (`S10LabNNComprobacionMain.java`). La salida inicial de los cuatro Main originales coincide con la esperada.

---

## Lab 00 · Materiales pendientes (Set)

**Predicción:** requeridos `{CARTULINA, PEGAMENTO, TIJERAS}`, disponibles `{CARTULINA, REGLA}` → faltan `[PEGAMENTO, TIJERAS]`. REGLA no resta nada porque no está en requeridos. ✔ coincide con la ejecución.

**¿Por qué copiar antes de `removeAll`?** Si `faltantes()` aplicara `removeAll` sobre `requeridos`, borraría para siempre los materiales ya conseguidos: `cantidadRequeridos()` cambiaría y las consultas futuras darían un resultado incorrecto; con la copia, los dos conjuntos internos quedan intactos.

Comprobaciones (`s10lab00/S10Lab00ComprobacionMain.java`):

| Acción | Resultado | Cantidad |
| --- | --- | --- |
| `disponer("TIJERAS")` y luego `faltantes()` | `[]` | requeridos sigue en 3 |
| `disponer(null)` | `false` | disponibles sigue en 4 |
| `disponer("   ")` | `false` | disponibles sigue en 4 |
| `disponer(" cartulina ")` (repetido) | `false` | disponibles sigue en 4 |
| Vaciar el Set devuelto por `faltantes()` | `faltantes()` vuelve a dar `[CARTULINA]` | la copia es independiente |

---

## Lab 01 · Recuento de votos (Map)

**Predicción:** A, B, A, C, B, A → A=3, B=2, C=1, total 6. ✔ coincide.

**¿Por qué `put` debe reemplazar?** El valor asociado a cada clave es un contador: `votos.put(opcion, votos.get(opcion) + 1)` lee el valor anterior y guarda el nuevo bajo la misma clave; como un Map no admite claves duplicadas, `put` sustituye el valor viejo, que es justo lo que se quiere (si se conservaran ambos, el contador no tendría sentido). `containsKey` antes impide que una opción como X cree una clave nueva.

Comprobaciones (`s10lab01/S10Lab01ComprobacionMain.java`):

| Escenario | Resultado |
| --- | --- |
| Secuencia C, A, B, A, B, A | `{A=3, B=2, C=1}`, total 6 (mismo resultado: TreeMap ordena por clave, no por orden de voto) |
| Secuencia vacía | `{A=0, B=0, C=0}`, total 0 |
| `votar(" a ")` | `true` → A=1 (se quitan espacios y se pasa a mayúsculas) |
| `votar(null)` / `votar("X")` | `false` / `false`; reporte final `{A=1, B=0, C=0}`, total 1 |

**Explicación:** las claves válidas se fijan en el constructor; `votar` solo actualiza claves existentes, así que entradas inválidas se rechazan sin alterar el mapa ni el total.

---

## Lab 02 · Prioridad de incidencias (enum)

**Prioridad:** constantes `BAJA(120), MEDIA(60), ALTA(15)`; campo `private final int limiteMinutos`; constructor privado implícito que lo asigna; consulta `getLimiteMinutos()`. `values()` recorre las constantes en el orden de declaración (BAJA, MEDIA, ALTA) y cada límite sale del argumento entre paréntesis.

**Incidencia:** guarda la prioridad en `private final Prioridad prioridad` y `estaVencida()` pregunta a la propia constante `prioridad.getLimiteMinutos()`; no usa `ordinal()` ni compara Strings.

**¿Por qué ALTA con 15 no está vencida y con 16 sí?** Porque la condición es `minutosTranscurridos > prioridad.getLimiteMinutos()`: el operador `>` (estrictamente mayor) hace que 15 > 15 sea falso y 16 > 15 verdadero. Con `>=` el límite exacto ya contaría como vencido.

**Rechazo de -1:** `registrarMinutos(-1)` devuelve `false` y no asigna; se conservan los 121 minutos. Un valor aceptado reemplaza el anterior (no se suma).

Comprobaciones (`s10lab02/S10Lab02ComprobacionMain.java`):

| Incidencia | Minutos | `estaVencida()` |
| --- | --- | --- |
| MEDIA | 60 | `false` |
| MEDIA | 61 | `true` |
| BAJA | 120 | `false` |

---

## Lab 03 · Carga de mediciones (excepciones)

**Predicción** para `"20", "abc", " 25 ", "80", "", "-10"`:

| Entrada | Resultado | Motivo |
| --- | --- | --- |
| `"20"` | aceptada | entero en rango |
| `"abc"` | rechazada | texto no convertible (`NumberFormatException`) |
| `" 25 "` | aceptada | `strip()` antes de `parseInt` |
| `"80"` | rechazada | se convierte, pero está fuera de rango |
| `""` | rechazada | dato obligatorio ausente |
| `"-10"` | aceptada | límite inferior inclusivo |

Lecturas `[20, 25, -10]`, 3 aceptadas, 3 rechazadas, promedio 35 / 3 = `11.6667`. ✔ coincide.

**Recorrido de `registrar`:** primero la validación de null/blanco; luego `Integer.parseInt(texto.strip())` dentro del `try`; el `catch (NumberFormatException)` cuenta el rechazo y hace `return false`; después la validación de rango `valor < -10 || valor > 50`. `lecturas.add(valor)` está al final y solo se alcanza si ninguna de las tres comprobaciones anteriores ejecutó un `return false`. En Debug, con `"abc"` la ejecución salta de `parseInt` al `catch` y el bucle del Main sigue con `" 25 "`.

Comprobaciones (`s10lab03/S10Lab03ComprobacionMain.java`):

| Entradas | Aceptadas | Rechazadas | Promedio |
| --- | --- | --- | --- |
| `{"abc", "", "80"}` | 0 | 3 | `Sin datos` |
| `{"-10", "50"}` | 2 | 0 | `20.0000` |

**Diferencia:** un error de conversión significa que el texto ni siquiera es un número entero (Java lanza `NumberFormatException`), mientras que un rechazo de rango es un número válido que incumple una regla del dominio, y se detecta con un `if` normal, sin excepción.
