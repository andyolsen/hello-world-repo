import React from 'react';
import Retailer from '../Retailer/Retailer';

export default function App({retailers, title}: any) {
  return (
    <div>
        <header>
            <h1>{title}</h1>
        </header>
        <div>
            {retailers.map((r: any, i: number) =>
                <Retailer key={i} {...r} />
            )}
        </div>
    </div>  );
}

export function f1() {}
export let x = 24
export class K {}

