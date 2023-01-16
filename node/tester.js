#!/usr/bin/env node
'use strict';
import { Kollavarsham } from 'kollavarsham';

var kv = new Kollavarsham();
const date = kv.fromGregorianDate(new Date())
console.log(`${date} - ${date.mlMasaName} - ${date.mlNaksatraName}`);