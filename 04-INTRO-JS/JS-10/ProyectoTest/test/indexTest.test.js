//Prueba efectiva
//Importa el artefacto de prueba de donde se encuentra
// const indexTest = require ("../calculadora"); ecma 5
import { indexTest } from "../calculadora"; // ecma6

test('test suma', () => {
    const r = indexTest.suma(3,2);
    expect (r).toBe(5);
})
test.todo('test resta');
test.todo('test multi');
test.todo('test div');
