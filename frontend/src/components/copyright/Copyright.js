import React from "react";
import CopyrightIcon from './copyright.svg';

import './Copyright.css';
import './__img/CopyrightImg.css';

class Copyright extends React.Component {
    render() {
        return (
            <div className="copyright">
                <img src={CopyrightIcon} alt="Copyright" className="copyright__img"/>
                <div className="copyright__text">
                    Company name
                </div>
            </div>
        );
    }
}

export default Copyright;