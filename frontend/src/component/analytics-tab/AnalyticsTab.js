import {Component} from "react";

import "./AnalyticsTab.css";

export class AnalyticsTab extends Component {

    render() {
        return (
            <div className={"analytics-container"}>
                <div className="analytics-header">
                    Here is the Analytics tab header
                </div>
                <div className="analytics-content">
                    Here is the Analytics tab content
                </div>
            </div>
        );
    }

}