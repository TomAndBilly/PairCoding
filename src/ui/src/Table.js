import React, {Component} from 'react';
import HitButton from './HitButton.js'
import StickButton from './StickButton.js'

class Table extends Component{
render(){
    return(
        <div>
            <table>
                <tc>
                    <th><HitButton /></th>
                    <th><StickButton /></th>
                </tc>
            </table>
        </div>
        );
    }
}

export default Table;